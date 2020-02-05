public class IteratorSample1 {
	public static void main(String[] args) {
		CDListAggregate cdListAggregate = new CDListAggregate();
		Iterator iterator = cdListAggregate.createIterator();
		cdListAggregate.add(new CD("King Gnu", 1200));
		cdListAggregate.add(new CD("Eve", 1000));
		cdListAggregate.add(new CD("ずとまよ", 1500));
		cdListAggregate.add(new CD("花譜", 1800));

		iterator.first(); // まず探す場所を先頭位置にしてもらう
		while ( ! iterator.isDone() ) { // まだある？ まだあるよ！
			CD cd = (CD)iterator.getItem(); // はいどうぞ (と受取る)
			System.out.println(cd.getName());
			iterator.next(); // 次を頂戴
		}
	}
}