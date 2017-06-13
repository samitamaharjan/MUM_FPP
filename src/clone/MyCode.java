package clone;

class MyCode  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Data data = new Data();
        Data clone = (Data) data.clone();
    }
    
}

class Data implements Cloneable {
    Methodology methodology = new Methodology();
    Result result = new Result();
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        Data dataClone = (Data) super.clone();
        dataClone.methodology =  (Methodology) methodology.clone();
        dataClone.result = (Result) result.clone();
        return dataClone;
    }
}

class Methodology implements Cloneable {
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Methodology) super.clone();
    }
}

class Result implements Cloneable {
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Result) super.clone();
    }
}