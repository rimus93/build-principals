package com.test;

class Test {

  public class ComplicatedDataHolder {
    public final String data;
    public final int num;

    public static class Builder {
        private String data;
        private int num;
        
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        public Builder num(int num) {
            this.num = num;
            return this;
        }

        public ComplicatedDataHolder build() {
            return new ComplicatedDataHolder(data, num);
        }  
    }
}ЪЪ

}
