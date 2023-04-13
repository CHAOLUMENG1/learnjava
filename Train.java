package jp.dcnet.it.c11;

import java.util.ArrayList;
import java.util.List;

//電車クラス
class Train {
	private List<TrainCar> cars; // 車両リスト

	public Train(int numCars, int capacity) {
		this.cars = new ArrayList<TrainCar>();
		for (int i = 0; i < numCars; i++) {
			this.cars.add(new TrainCar(capacity));
		}
	}

	public boolean addPassenger() {
		for (TrainCar car : this.cars) {
			if (!car.isFull()) {
				car.addPassenger();
				return true;
			}
		}
		return false; // 全ての車両が定員オーバーの場合はfalseを返す
	}

	public String getNumPassengers() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
