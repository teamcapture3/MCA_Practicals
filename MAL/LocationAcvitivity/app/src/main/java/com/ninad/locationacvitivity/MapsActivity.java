package com.ninad.locationacvitivity;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

@SuppressWarnings("ALL")
public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    MarkerOptions markerOptions;
    CameraPosition cameraPosition;
    NotificationManager notificationManager;
    String markerTitle;
    Double newLongitude, newLatitude;
    Bitmap markerIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_maps);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);
        markerOptions = new MarkerOptions();
        notificationManager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        notificationManager.cancel(0);
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 3000, null);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        newLatitude = getIntent().getDoubleExtra("Latitude", 0.0);
        newLongitude = getIntent().getDoubleExtra("Longitude", 0.0);

        if (newLatitude == 0.0 && newLongitude == 0.0) {
            freshStart();
        } else {
            startedViaNotification();
        }

        // setOnMapClickListener to add new marker to the Map, when user click on Map
        mMap.setOnMapClickListener(latLng -> {
            // Getting new latitude and longitude for touched position
            newLatitude = latLng.latitude;
            newLongitude = latLng.longitude;

            // Setting the position for the marker, latLng holds the latitude, longitude values of the position user clicked
            markerOptions.position(latLng);
            // Setting the title for the marker. This will be displayed on taping the marker
            markerTitle = "New Location: " + newLatitude + " : " + newLongitude;
            markerOptions.title(markerTitle);
            // Clears the previously touched position or marked position
            mMap.clear();
            // Animating and moving camera focus to the touched position
            cameraPosition = new CameraPosition.Builder().target(latLng).zoom(17).build();
            mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
            // Placing a marker on the touched position
            mMap.addMarker(markerOptions);
            // Sending Notification for the current marker added
            sendNotification();
        });
    }

    public void freshStart() {
        // Setting latitude and longitude value for VESIT
        newLatitude = 19.046004;
        newLongitude = 72.88941;
        // Creating position for VESIT
        LatLng vesit = new LatLng(newLatitude, newLongitude);
        // Add position to a marker
        markerOptions.position(vesit);
        // Set title to marker
        markerOptions.title("VESIT");
        // Add the marker to Map
        mMap.addMarker(markerOptions);
        // Create a camera position to focus on current marker
        cameraPosition = new CameraPosition.Builder().target(vesit).zoom(17).build();
        // Animate the camera to current position on Map
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 3000, null);
    }

    public void startedViaNotification() {
        notificationManager.cancel(0);
        LatLng newLatLng = new LatLng(newLatitude, newLongitude);
        markerTitle = "New Location: " + newLatitude + " : " + newLongitude;
        markerOptions.position(newLatLng);
        markerOptions.title(markerTitle);
        mMap.clear();
        mMap.addMarker(markerOptions);
        cameraPosition = new CameraPosition.Builder().target(newLatLng).zoom(17).build();
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 3000, null);
    }

    public void sendNotification() {
        String channelId = "notify_001";
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(getApplicationContext(), channelId);
        Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
        intent.putExtra("latitude", newLatitude);
        intent.putExtra("longitude", newLongitude);
        @SuppressLint("UnspecifiedImmutableFlag") PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.BigTextStyle bigText = new NotificationCompat.BigTextStyle();
        bigText.bigText(markerTitle.substring(4));
        bigText.setBigContentTitle("New Location Marked");
        bigText.setSummaryText("Marked Location");
        mBuilder.setContentIntent(pendingIntent);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher_round);
        mBuilder.setContentTitle("New Location Marked");
        mBuilder.setContentText(markerTitle.substring(4));
        mBuilder.setPriority(Notification.PRIORITY_MAX);
        mBuilder.setStyle(bigText);
        mBuilder.setLargeIcon(markerIcon);
        // === Removed some obsoletes
        NotificationChannel channel = new NotificationChannel (channelId, "Marker Location Channel", NotificationManager.IMPORTANCE_HIGH);
        notificationManager.createNotificationChannel(channel);
        mBuilder.setChannelId(channelId);
        notificationManager.notify(0, mBuilder.build());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Change the map type based on the user's selection.
        switch (item.getItemId()) {
            case R.id.normal_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.satellite_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}