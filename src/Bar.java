class Bar {

    static int statisch = 0;

    int nichtStatisch = 0;

    Bar(){
        this.nichtStatisch++;
        statisch++;
    }
}
