package by.htp.prediction.run;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

import by.htp.prediction.entity.Client;
import by.htp.prediction.entity.PredictionOfWeather;

public class PredictionResult {

	public static void main(String[] args) {
		//for test
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "fair");
		map.put(2, "fog");
		map.put(3, "sunny");
		map.put(4, "rain");
		map.put(5, "snow");

		//trying
//		Queue<Client> countOfClients = new PriorityQueue<>(10);
//        for(int i=1; i<11; i++){
//            countOfClients.add(new Client(i));
//        }
        
		PredictionOfWeather pow = new PredictionOfWeather();
		pow.menu(map);
	}

}
