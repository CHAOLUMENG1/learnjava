package jp.dcnet.it.c11;

import java.util.ArrayList;
import java.util.List;

//路線クラス
public class Line {
	private String name; // 路線名
	private List<Station> stations; // 駅リスト

	public Line(String name) {
		this.name = name;
		this.stations = new ArrayList<Station>();
	}

	public String getName() {
		return this.name;
	}

	public void addStation(Station station) {
		this.stations.add(station);
	}

	public List<Station> getStations() {
		return this.stations;
	}
}