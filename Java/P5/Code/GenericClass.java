public class GenericClass<T extends A> {
	private T t;
	public GenericClass(T t){
        this.t = t;
    }
	public void doRunTest() {
		this.t.displayClass();
	}
	public static void main(String[] args) {
		GenericClass<C> gcc = new GenericClass<C>(new C());
		gcc.doRunTest();
		GenericClass<B> gcb = new GenericClass<B>(new B());
		gcb.doRunTest();
		GenericClass<A> gca = new GenericClass<A>(new A());
		gca.doRunTest();
	}
}
class A {
	public void displayClass() {
		System.out.println("Inside super class A");
	}
}
class B extends A {
	public void displayClass() {
		System.out.println("Inside sub class B");
	}
}
class C extends A {
	public void displayClass() {
		System.out.println("Inside sub class C");
	}
}
