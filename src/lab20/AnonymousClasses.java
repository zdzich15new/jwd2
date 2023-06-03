package lab20;

public class AnonymousClasses {
    public interface GreetingModule {
        void sayHello();
    }

    public static class Robot {
        private final GreetingModule greetingModule;

        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }

        public void saySomething() {
            greetingModule.sayHello();
        }
    }

    public static void main(String[] args) {
        Robot jan = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Dzien dobry");
            }
        });

        Robot john = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Good morning");
            }
        });

        Robot alejandro = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Bienvenido");
            }
        });

        Robot stan = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Willkommen");
            }
        });

        jan.saySomething();
        john.saySomething();
        alejandro.saySomething();
        stan.saySomething();
    }
}
