class CD {
	private String name; // 名称
	private int price; // 価格
	public CD(String name, int price) { // コンストラクタ
		this.name= name;
		this.price = price;
	}
	public String getName() { // 名称を取得
		return name;
	}
	public int getPrice() { // 価格を取得
		return price;
	}
}
