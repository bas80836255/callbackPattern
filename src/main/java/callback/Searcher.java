package callback;

public class Searcher {

    public void startSearch() throws InterruptedException {
        System.out.println("start search");
        findSomething("shoe", new TheCallback() {
            @Override
            public void onFinishSearch(String itemSearch) {
                System.out.println(itemSearch);
            }
        });
        System.out.println("after search");
        System.out.println("stop search");
    }

    public void findSomething(String item, TheCallback theCallback) throws InterruptedException {
        for (int i = 0; i < 100000; i++) {
            System.out.println("1");
        }
//            Thread.sleep(10000);
            theCallback.onFinishSearch("find " + item + " success");
//            break;
//        }
    }
}
