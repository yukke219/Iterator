class CDListAggregate implements Aggregate {
	private CD[] list = new CD[20];
	private int numberOfStock;
	
	@Override
	public Iterator createIterator() {
		return new CDListIterator(this);
	}
	public void add(CD cd) {
		list[numberOfStock] = cd;
		numberOfStock += 1;
	}
	public Object getAt(int number) {
		return list[number];
	}
	public int getNumberOfStock() {
		return numberOfStock;
	}
}