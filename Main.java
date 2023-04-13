package jp.dcnet.it.c11;

import java.util.List;

//メインクラス
public class Main {
	public static void main(String[] args) {
		// 山手線
		Line yamanote = new Line("山手線");

		// 駅情報
		yamanote.addStation(new Station("東京"));
		yamanote.addStation(new Station("有楽町"));
		yamanote.addStation(new Station("新橋"));
		yamanote.addStation(new Station("浜松町"));
		yamanote.addStation(new Station("田町"));
		yamanote.addStation(new Station("品川"));
		yamanote.addStation(new Station("大崎"));
		yamanote.addStation(new Station("五反田"));
		yamanote.addStation(new Station("目黒"));
		yamanote.addStation(new Station("恵比寿"));
		yamanote.addStation(new Station("渋谷"));
		yamanote.addStation(new Station("原宿"));
		yamanote.addStation(new Station("代々木"));
		yamanote.addStation(new Station("新宿"));
		yamanote.addStation(new Station("新大久保"));
		yamanote.addStation(new Station("高田馬場"));
		yamanote.addStation(new Station("目白"));
		yamanote.addStation(new Station("池袋"));
		yamanote.addStation(new Station("大塚"));
		yamanote.addStation(new Station("巣鴨"));
		yamanote.addStation(new Station("駒込"));
		yamanote.addStation(new Station("田端"));
		yamanote.addStation(new Station("西日暮里"));
		yamanote.addStation(new Station("日暮里"));
		yamanote.addStation(new Station("鶯谷"));
		yamanote.addStation(new Station("上野"));
		yamanote.addStation(new Station("御徒町"));
		yamanote.addStation(new Station("秋葉原"));
		yamanote.addStation(new Station("神田"));

		// 駅リストを取得して表示
		List<Station> stations = yamanote.getStations();
		for (Station station : stations) {
			System.out.println(station.getName());
		}

	}
}
