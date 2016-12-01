/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 18:05
 * 具体迭代器类，倒序
 */
public class ConcreteIteratorDesc implements Iterator {

	private ConcreteAggregate aggregate;

	private int current = 0;

	public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
		this.current = aggregate.getCount() - 1;
	}

	@Override
	public Object first() {
		return aggregate.getThis(aggregate.getCount() - 1);
	}

	@Override
	public Object next() {

		current--;

		if(current >= 0) {
			return aggregate.getThis(current);
		}
		return null;
	}

	@Override
	public boolean isDone() {
		return current < 0;
	}

	@Override
	public Object currentItem() {
		return aggregate.getThis(current);
	}
}
