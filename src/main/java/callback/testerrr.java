package callback;

public class testerrr {

    private interface IWorkSecondCallback {
        public void fnWorkSecond(String data_back);
    }

    private void fnWorkFirst(IWorkSecondCallback callback) {
        System.out.println("Work First");
        callback.fnWorkSecond("send data back");
    }

    public void tester(){
        fnWorkFirst(new IWorkSecondCallback() {
            @Override
            public void fnWorkSecond(String data_back) {
                System.out.println("Work Second");
                System.out.println(data_back);
            }
        });
    }

}
