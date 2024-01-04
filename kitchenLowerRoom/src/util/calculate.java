package util;

public class calculate {
	
	public static Integer Sum(Integer trip,Integer chestnutPorkRibs,Integer spicyPorkKnuckle)
	{
		Integer S = trip*160 + chestnutPorkRibs*450 + spicyPorkKnuckle*530;
		return S;
	}
	public static Integer discountSum(Integer trip,Integer chestnutPorkRibs,Integer spicyPorkKnuckle)
	{
		Integer S = (trip*160 + chestnutPorkRibs*450 + spicyPorkKnuckle*530)-180;
		return S;
	}	
	public static String detalls(Integer trip,Integer chestnutPorkRibs,Integer spicyPorkKnuckle)
	//細項
	{
		return "麻辣牛肚 : " + trip + " 包\t"
        		+ "金額 : " + trip*160 + "元\n\n"
                + "栗子排骨 : " + chestnutPorkRibs + " 包\t"
                + "金額 : " + chestnutPorkRibs*450 + "元\n\n"
                + "麻辣豬肘子 : " + spicyPorkKnuckle + " 包"
                + "    金額 : " + spicyPorkKnuckle*530 + "元\n\n";
	}
	
	public static String sum(Integer trip,Integer chestnutPorkRibs,Integer spicyPorkKnuckle) 
	//總金額
	{
		Integer s = trip*160 + chestnutPorkRibs*450 + spicyPorkKnuckle*530;
		return "總金額 : " + s.toString() ;	
	}
	
	public static String discountsum(Integer trip,Integer chestnutPorkRibs,Integer spicyPorkKnuckle)
	//免運折扣
	{
		Integer s = (trip*160 + chestnutPorkRibs*450 + spicyPorkKnuckle*530)-180;
		
		return "總金額(含免運折扣) : " + s.toString();
		
		
	}
	
	public static String remainder(int payBack) 
	//找零
	{
 
	     return "找零金額 : " + payBack + "\n千元鈔張數 : " + payBack / 1000 + 
				"\n百元鈔張數 : " + (payBack % 1000) / 100 + 
				"\n50元個數 : "+ ((payBack % 1000) % 100) / 50 + 
				"\n10元個數 : " + (((payBack % 1000) % 100) % 50) / 10 + 
				"\n5元個數 : "+ ((((payBack % 1000) % 100) % 50) % 100) / 5 + 
				"\n1元個數 : " + ((((payBack % 1000) % 100) % 50) % 10) % 5;
	}
	
	public static String wrongpay() 
	{	    
		return "付款金額錯誤請重新輸入";
	}
}

