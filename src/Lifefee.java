import java.awt.image.Raster;
import java.util.*;

public class Lifefee {

	
	public static Map<String,Double> calculatorLifeFee(final double eleFeeTotal, final double waterFeeTotal ,final double gasFeeTotal ,double rateXuwei,double rateWang,double ratePu,double rateJason ){
		Map<String,Double> allPeople = new HashMap<String,Double>();
		double eleOneTemp = 0.0d;
		double waterOneTemp = 0.0d;
		double gasOneTemp = 0.0d;
		

		eleOneTemp = (double) (eleFeeTotal/(rateXuwei+rateWang+ratePu+rateJason));
		System.out.println(eleOneTemp);
		waterOneTemp = (double) (waterFeeTotal/(rateXuwei+rateWang+ratePu+rateJason));
		System.out.println(waterOneTemp);
		gasOneTemp = (double) (gasFeeTotal/(rateXuwei+rateWang+ratePu+rateJason));
		System.out.println(gasOneTemp);
		
		allPeople.put("XuWei",(double) ((eleOneTemp+waterOneTemp+gasOneTemp)*rateXuwei) );
		allPeople.put("WangPengFei", (double) ((eleOneTemp+waterOneTemp+gasOneTemp)*rateWang) );
		allPeople.put("xiaoPu", (double) ((eleOneTemp+waterOneTemp+gasOneTemp)*ratePu) );
		allPeople.put("YanKun", (double) ((eleOneTemp+waterOneTemp+gasOneTemp)*rateJason) );
		
		
		return  allPeople;
		
		
	} 
	
	public static Map<String,Double> calculatorLifeFee1(final double lifeFeeTotal ,double rateXuwei,double rateWang,double ratePu,double rateJason ){
		Map<String,Double> allPeople = new HashMap<String,Double>();
		double lifeOneTemp = 0.0d;

		

		lifeOneTemp = (double) (lifeFeeTotal/(rateXuwei+rateWang+ratePu+rateJason));
		//System.out.println(lifeOneTemp);

		
		allPeople.put("XuWei",(double) (lifeOneTemp*rateXuwei) );
		allPeople.put("WangPengFei", (double) (lifeOneTemp*rateWang) );
		allPeople.put("xiaoPu", (double) (lifeOneTemp*ratePu) );
		allPeople.put("YanKun", (double) (lifeOneTemp*rateJason) );
		
		
		return  allPeople;
		
		
	} 
	
	public static void main(String[] args) {
		
		Map<String,Map<String,Double>> lifefee = new HashMap<String, Map<String,Double>>();
		
		lifefee.put("August", calculatorLifeFee1(817.0,1.0,2.0,1.2,1.0));
		lifefee.put("September", calculatorLifeFee1(561.0,1.0,1.0,1.4,1.0));
		
		Iterator<Map.Entry<String,Map<String,Double>>> results1 = lifefee.entrySet().iterator();
		
		while (results1.hasNext()) {
			Map.Entry<java.lang.String, java.util.Map<java.lang.String, java.lang.Double>> entry = (Map.Entry<java.lang.String, java.util.Map<java.lang.String, java.lang.Double>>) results1
					.next();
			System.out.println(entry.getKey()+" " +" "+entry.getValue());
			
		}
		
		
		
/*		Map<String,Double> peoples  =	calculatorLifeFee1(1000.0,1.0,1.2,1.0,1.0);
	  
     Iterator<Map.Entry<String,Double>> results = peoples.entrySet().iterator();
     
     while (results.hasNext()) {
		Map.Entry<java.lang.String, java.lang.Double> entry = (Map.Entry<java.lang.String, java.lang.Double>) results
				.next();
		
		System.out.println(entry.getKey()+" need to charge " +" "+entry.getValue());
		
		
	}*/
	 }
	
}
