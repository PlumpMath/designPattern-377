/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 18:05
 * 具体迭代器类，正序
 */
public class ConcreteIterator implements Iterator {

	private ConcreteAggregate aggregate;

	private int current = 0;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		return aggregate.getThis(0);
	}

	@Override
	public Object next() {

		current++;

		if(current < aggregate.getCount()) {
			return aggregate.getThis(current);
		}
		return null;
	}

	@Override
	public boolean isDone() {
		return current >= aggregate.getCount();
	}

	@Override
	public Object currentItem() {
		return aggregate.getThis(current);
	}
}
