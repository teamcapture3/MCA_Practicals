<html>
<head>
	<title>News</title>
	<style type="text/css">
	div.container{
		width: 100%;
		border: 1px solid gray;
	}
	div.ads {
		width: 100%;
		border: 1px solid gray;
	}
	header{
		padding: 1em;
		color: white;
		background-color: red;
		clear: left;
		text-align: center;
	}
	</style>
</head>
<body>
  <div class="container">
    <header>
 	   <center><h1>Today's Breaking News</h1></center>
    </header>
  </div>
<?php
$news = array("<b>Australian great Ian Chappell says India's attitude towards achieving excellence should be copied by the ambitious cricket nations for the well-being of the Test format.
In the wake of their 3-0 whitewash of South Africa in a Test series recently, the former Australian captain called India the envy of world cricket.
Leaving aside India, England and Australia, he has expressed concerns over the decline of other Test-playing nations such as South Africa and Sri Lanka.If Test cricket is to be a viable part of the game's future, the standard of play needs to remain high. Whilst it's true India - with a large talent pool, unlimited finances and the IPL - has a huge advantage, it's their attitude towards achieving excellence that should be copied by any team with an ambition to be the best, Chappell wrote in his column for 'ESPNcricinfo'.
India blanked South Africa despite missing their premier pacer Jasprit Bumrah, consolidating their position at the top of the ICC Test Championship standings.
He said the Indian pace attack is now equipped to shine in all conditions across the world.Bumrah, when fit, the indefatigable Mohammed Shami, the vastly improved Ishant Sharma, and the pacy Umesh Yadav give India a quartet of fast bowlers that demand respect in all conditions.
These pace spearheads, added to India's always capable spinners, give the attack a potency that not too many other countries can match, Chappell said.
The legendary batsman added, Slot a fit seam-bowling allrounder in Hardik Pandya into that group and India are more than adequately placed to cope with any conditions they encounter.
</b>",

"<b>The OnePlus 7T and OnePlus 7T Pro are fantastic smartphones in every way. If you want the fastest and smoothest Android phones, these are the ones that are instantly recommendable. And starting at Rs 37,999, these two can be considered great deals which, apparently, get better now. From October 26, that is today, you can get up to Rs 8,000 off on the new OnePlus 7T series phones.
With a bunch of special offers, you can get the OnePlus 7T and OnePlus 7T Pro with a discount of up to Rs 8,000. OnePlus is offering a host of extra benefits on its latest flagship phones and customers can get up to Rs 5,500 off on the OnePlus 7T. All the combined benefits on the OnePlus 7T Pro bring down the price of this flagship by Rs 8,000. The same benefits are also applicable on the OnePlus 7 Pro.</b>",

"<b>Will you be willing to give your face to be put on thousands of robots worldwide for Rs 91,02,179 (100,000 pounds)? No, we are not just making this up. A start-up tech company is actually looking for a 'kind and friendly' face to put on their robots.
The unnamed firm is looking for human faces for the robots, which will be used as virtual friends for elderly people, and for the same, they have lodged a request with the company Geomiq.com.
Geomiq wrote that they were approached by a robotics company to help with the finishing touches to a state-of-art humanoid robot. They did not give out a lot of details about the company due to a non-disclosure agreement that they have signed.
The company knows that it is an unusual request and that it is a big deal, which is why they are ready to pay so much money. The robots are set to go into production next year.People are a little concerned about this demand and are asking why can't the company just make a new face exactly like Sophia, the social humanoid robot developed by Hong Kong based company Hanson Robotics.
Technology reporter Rowland Manthorpe took to his Twitter account to call it a bad sci-fi plot. He wrote, Bad sci-fi plot alert. This unnamed company is looking for someone to be the face of its robot, which will be used as a virtual friend for elderly people. It's offering £100,000 for the rights to your face in perpetuity.</b>");
$ran = array_rand($news,2);
echo "<br>";
echo  $news[$ran[0]] ."<br><br><br>\n";
?>
<body>
  <div class="ads">
    <header>
 	   <center><h1>Today's Advertisement</h1></center>
    </header>
  </div>
<?php
$advt = array("<center><h3>BUY ANY 2 Medium/Large Pizzas and Get 3rd Medium/Large Pizza Free</h3>
<p>Offer Is For Every Thursday Only</p></center>", 
"<center><h3>Get 25% Cashback on Starters</h3>
<p>Coupon Code FREE25</p><p>Limited offer</p></center>", 
"<center><h3>Buy 2 Jeans and Get 2Jeans Free</h3>
<p>One Jean Cost Rs2000\- </p>
<p>Coupon Code JEANS2019</p>
</center>",
"<center><h3>Get Rs 500 off on Hotel bookings on Trivago</h3>
<p>Offer Applicable on 3Days/2Nights Booking Only</p> <p>Coupon Code Trivago500</p>
</center>");
$ran_advt = array_rand($advt,2);
echo "<br>";
echo  $advt[$ran[0]] ."\n";
?>
</body>
</html>