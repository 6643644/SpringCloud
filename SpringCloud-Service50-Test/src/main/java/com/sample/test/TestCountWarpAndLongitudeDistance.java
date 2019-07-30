package com.sample.test;

/**
 * @author Miles
 * 
 *  計算兩組經緯度之間的間距
 *  沒有針對傳入空字串處理，所以如果傳入空字串會換掉
 * 
 */
public class TestCountWarpAndLongitudeDistance {

	public static void main(String[] args) {
		
		System.out.println(countWarpAndLongitudeDistance("25.0329636","121.56542680000001","25.0329636","121.56542680000001"));

	}
	
	
private static final double EARTH_RADIUS = 6378.137;
	
	/**
	 * 計算兩組經緯度之間的距離
	 * 
	 * @param LonA
	 *            經度
	 * @param LatA
	 *            緯度
	 * @param LonB
	 *            經度
	 * @param LatB
	 *            緯度
	 * @return double 距離
	 */
	public static double countWarpAndLongitudeDistance(String lat1A, String lng1A, String lat2B, String lng2B) {
		double lat1 = Double.parseDouble(lat1A);
		double lng1 = Double.parseDouble(lng1A);
		double lat2 = Double.parseDouble(lat2B);
		double lng2 = Double.parseDouble(lng2B);

		double radLat1 = rad(lat1);
		double radLat2 = rad(lat2);
		double a = radLat1 - radLat2;
		double b = rad(lng1) - rad(lng2);
		double s = 2 * Math.asin(Math.sqrt(
				Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
		s = s * EARTH_RADIUS;
		return s;
	}
	
	private static double rad(double d) {
		return d * Math.PI / 180.0;
	}

}
