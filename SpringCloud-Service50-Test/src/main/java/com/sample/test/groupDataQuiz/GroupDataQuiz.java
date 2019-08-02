package com.sample.test.groupDataQuiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupDataQuiz {

	public static void main(String[] args) {
		List<Map<String, Object>> dataList = wsRefundDatas(); //從DB撈回來的資料
		/*
		 * -----------------------------------
		 * 險別	|	保單號		|	退費金額	|
		 * -----------------------------------
		 *  AI	|	0018KVG001	|	   486	|
		 *  AL	|	0018KVG002	|	   100	|
		 *  FI	|	0018KVG003	|	   320	|
		 *  AI	|	0018KVG004	|	   120	|
		 *  FI	|	0018KVG005	|	   500	|
		 *  	AI	|	0018KVG006	|	  1430	|
		 */

		/*
		 * Lab：	請將 dataList依險別分組，組成一個以險別為 key的 Map物件，
		 * 		並將此物件傳入以下method後可印出如下的資料
		 * --------------------------------------------
		 * AI
		 * 0018KVG001,486
		 * 0018KVG004,120
		 * 0018KVG006,1430
		 * AL
		 * 0018KVG002,100
		 * FI
		 * 0018KVG003,320
		 * 0018KVG005,500
		 */
		Map<String, List<Map<String, Object>>> groupData = new LinkedHashMap<String, List<Map<String, Object>>>();

		groupData = 
		dataList.stream().collect(Collectors.groupingBy(m -> (String) m.get("inslin"), TreeMap::new, Collectors.toList()));
		dataList.stream().collect(Collectors.groupingBy(d-> d.get("inslin"),Collectors.toList()));
//		dataList.stream().collect(collector)
		groupDataByInslin(groupData);

	}

	static void groupDataByInslin(Map<String, List<Map<String, Object>>> listMap) {
		Set<String> keySet = listMap.keySet();
		for (String key : keySet) {
			System.out.println(key);
			List<Map<String, Object>> list = listMap.get(key);
			for (Map<String, Object> map : list) {
				System.out.println((String) map.get("polyno") + "," + (int) map.get("refundAmt"));
			}
		}
	}

	/**
	 * 待退費資料(多筆)
	 */
	static List<Map<String, Object>> wsRefundDatas() {
		List<Map<String, Object>> wsDataList = new ArrayList<Map<String, Object>>();
		wsDataList.add(setRefundData("AI", "0018KVG001", 486));
		wsDataList.add(setRefundData("AL", "0018KVG002", 100));
		wsDataList.add(setRefundData("FI", "0018KVG003", 320));
		wsDataList.add(setRefundData("AI", "0018KVG004", 120));
		wsDataList.add(setRefundData("FI", "0018KVG005", 500));
		wsDataList.add(setRefundData("AI", "0018KVG006", 1430));
		return wsDataList;

	}

	/**
	 * 待退費資料
	 * @param inslin 險別
	 * @param polyno 保單號
	 * @param refundAmt 退費金額
	 * @return
	 */
	static Map<String, Object> setRefundData(String inslin, String polyno, int refundAmt) {
		Map<String, Object> entity = new HashMap<String, Object>();
		entity.put("inslin", inslin);
		entity.put("polyno", polyno);
		entity.put("refundAmt", refundAmt);
		return entity;
	}

}
