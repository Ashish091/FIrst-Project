package core;

import java.util.Scanner;

/*       
 GST ( Goods and Services Tax ) which is included in netprice of product for get GST % first need to calculate GST Amount by subtract original cost from Netprice and then apply
GST % formula = (GST_Amount*100) / original_cost


Netprice = original_cost + GST_Amount
GST_Amount = Netprice – original_cost
GST_Percentage = (GST_Amount * 100)/ original_cost

  */

public class GSTCal {
	
	public GSTCal(int orignal_price, int net_price)
	{
		int gst_amount=net_price-orignal_price;
		System.out.println("GST amount is :"+gst_amount);
		int gst_percantage=(gst_amount*100)/orignal_price;
		System.out.println("GST is "+gst_percantage+" %");
		
	}
	   
	    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the orignal price");
        int orignal_price=sc.nextInt();
        System.out.println("Enter the net price");
        int net_price=sc.nextInt();
        
        GSTCal gs=new GSTCal(orignal_price, net_price);
        System.out.println(gs.getClass().getName());
        sc.close();
  	}

}
