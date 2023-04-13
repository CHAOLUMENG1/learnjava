package jp.dcnet.it.c11;

//電車の1車両を表現するクラス
class TrainCar {
	private int capacity; // 定員
	private int occupancy; // 搭乗者数

	public TrainCar(int capacity) {
		this.capacity = capacity;
		this.occupancy = 0;
	}

	public boolean isFull() {
		return this.occupancy == this.capacity;
	}

	public boolean addPassenger() {
		if (this.isFull()) {
			return false; // 定員オーバーの場合はfalseを返す
		}
		this.occupancy++;
		return true;
	}
}
