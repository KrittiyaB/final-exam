public class MaxOrder {

    public long checkOrder2(long number){
        long result;
        number = number-1;
        long dig = number%10;
        long dec = number/10;
        if(dec <= dig){
            result = number;
        }else {
            result = checkOrder2(number);
        }
        return result;
    }

    public long checkOrder3(long number){
        long result = -1;
        number = number-1;

        long hun = number/100;
        long tHun = number%100;
        long dec = tHun/10;
        long dig = tHun%10;
        if(dig > dec && dec > hun){
            result = number;
        }else {
            result = checkOrder3(number);
        }
        return result;
    }

    public long getResult(long input){
        long result = -1;
        if(input < 10){
            result = input;
        }else{
            if(input < 100){
                long dig = input%10;
                long dec = input/10;

                if(dec <= dig){
                    result = input;
                }else{
                    result = checkOrder2(input);
                }
            }else if(input < 1000){
                long hun = input/100;
                long tHun = input%100;
                long dec = tHun/10;
                long dig = tHun%10;
                if(dig > dec && dec > hun){
                    result = input;
                }else {
                    result = checkOrder3(input);
                }
            }
        }
        return result;
    }

}
