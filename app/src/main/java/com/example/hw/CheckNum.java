package com.example.hw;

public class CheckNum {


        private int clicked;
        private int Unclicked;

        public int getClicked() {
            return clicked;
        }

        public void setClicked(int clicked) {
            this.clicked = clicked;
        }

        public int getUnclicked() {
            return Unclicked;
        }

        public void setUnclicked(int unclicked) {
            this.Unclicked = unclicked;
        }

        public int Check(int counter){

            if (this.getClicked() > this.getUnclicked()){
                counter = counter + 1 ;
            }

            else{
                counter = counter - 1;
            }
            return counter;
        }
    }

