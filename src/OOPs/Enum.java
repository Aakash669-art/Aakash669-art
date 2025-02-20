package OOPs;

enum Locator  {
    page_button("1bu#"),
    page_Input ("#ue");

    private String locator;
    Locator(String locator){

        this.locator = locator;

    }
String getLocator() {
    return this.locator;
}
}

