public class Mean
{
	static double variance(double a[],int n)
	{
		double sum=0;
		for(int i=0;i<n;i++)
		sum+=a[i];
		double mean= sum/(double)n;
		double sqdiff=0;
		for(int i=0;i<n;i++)
		sqdiff+=(a[i]-mean)*(a[i]-mean);
		return sqdiff/n;
	}
	static double standarddeviation(double arr[],int n)
	{
		return Math.sqrt(variance(arr,n));
	}
	static double mean(double array[],int n)
	{
		double sum=0;
		for(int i=0;i<n;i++)
		sum+=array[i];
		double mean= sum/(double)n;
		return mean;
	}
	public static void main(String[] args)
	{
		double arr[]={400,200,320,741,650,100};
		int n=arr.length;
		System.out.println("Variance: "+variance(arr,n));
		System.out.println("\nStandard Deviation: "+standarddeviation(arr,n));
		System.out.println("\nMean: "+mean(arr ,n));
	}
}