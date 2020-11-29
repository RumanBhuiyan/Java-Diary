abstract class AbstractClass {
    // it holds both complete body function & incomplete body function
    public void complete() {
        System.out.println("Complete body function");
    }

    // which class inherits it,will have to implement its body
    public abstract void incomplete();
}

// N.B:
// 1. abstract class is inherited by 'extends keyword'
// 2. we can't create object of any obstract class because its
// incomplete and it doesn't have any constructor
// 3.multi-class-inheritance isn't supported in java thats why
// you can't extends multiple abstractclass but on that time
// you have to use interface.