package jp.dcnet.it.c09_Test;

	    // Animalクラスの定義
	    public class Animal {
	        private String name;
	        // コンストラクタ
	        public Animal(String name) {
	            this.name = name;
	        }

	        public Animal(int age2, String name2, String classification2) {
				// TODO 自動生成されたコンストラクター・スタブ
			}

			// sayHelloメソッド
	        public void sayHello() {
	            System.out.println("Hello, I'm " + name + "!");
	        }

	        // getNameメソッド
	        public String getName() {
	            return name;
	        }
	    

	    // オブジェクトcatの作成とメソッド呼び出し
	    public static void main(String[] args) {
	        Animal cat = new Animal("Tama");
	        cat.sayHello();
	    }
	}