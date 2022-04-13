package com.zensr.test;


public class DessertShope {
	public static final int MAX_ITEM_NAME_SIZE = 0;

	public static void main(String[] args) {
		
		final int MAX_ITEM_NAME_SIZE = 0;
      // TODO Auto-generated method stub
		final double TAX_RATE = 6.5;
		final String STORE_NAME = "M & M Dessert Shope";
		final int MAX_ITEM_NAME_SIZE1 = 25;
		final int COST_WIDTH = 6;
		
		String cents2dollarsAndCents(int cents) {
			String s="";
			
			if(cents<0) {
				s+="-";
				cents*=-1;
			}
			
			int dollars=cents/100;
			cents=cents%100;
			
			if(dollars>0)
				s+="0";
			s+=cents;
			return s;
		}

	}
	public abstract class DessertItem {
		protected String name;
		
		public DessertItem() {
			this("");
		}
		
		public DessertItem(String name) {
			if (name.length()<=DessertShope.MAX_ITEM_NAME_SIZE)
				this.name=name;
			else
				this.name=name.substring(0,DessertShope.MAX_ITEM_NAME_SIZE);
		}
		
		public final String getName() {
			return name;
		}
		
		public abstract int getCost();
	}
	
	public class Cookie extends DessertItem{
		protected double number;
		protected double pricePerDoze;
		
		public Cookie(String _n, double _ppd, int _number) {
			super(_n);
			pricePerDoze=_ppd;
			number=_number;
		}
		
		public int getCost() {
			return (int)Math.round(number / 12 * pricePerDoze);
		}
	}
	
	public class Candy extends DessertItem{
		protected double weight;
		protected double pricePerPound;
		
		public Candy(String _n, double _ppp, int _w){
			super(_n);
			pricePerPound =  _ppp;
			weight = _w;
		}
		
		public int getCost() {
			return (int)Math.round(weight * pricePerPound);
		}
	}
	
	public class IceCream extends DessertItem{
		
		protected int cost;
		
		public IceCream(String _n, int _cost) {
			super(_n);
			cost = _cost;
		}
		
		public int getCost() {
			return cost;
		}
	}
}


