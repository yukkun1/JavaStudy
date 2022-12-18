public class begineer {
    public static void main(String[] args) {
        int num = 3;
        double pie = 3.14;
        char blood = 'A';
        boolean fun = true;
        String msg = "入門";
        System.out.println(num);
        System.out.println(pie);
        System.out.println(blood);
        System.out.println(fun);
        System.out.println(msg);

        String[] name = new String[5];
        name[0] = "岡本";
        name[1] = "佐藤";
        name[2] = "村上";
        name[3] = "大谷";
        name[4] = "落合";
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);

         int[] data =  new int[4];
        data[0] = 90;
        data[1] = 80;
        data[2] = 100;
        data[3] = 90;
        System.out.println("1人目は" + data[0] + "点");
        System.out.println("2人目は" + data[1] + "点");
        System.out.println("3人目は" + data[2] + "点");
        System.out.println("4人目は" + data[3] + "点");
    
        //演習問題2 
        //int height = Integer.parseInt(args[0]);
        //int width = Integer.parseInt(args[1]); 
        //double area; 
        //area = height * width / 2.0;
        //System.out.println("高さ" + height);
        //System.out.println("幅" + width);
        //System.out.println("面積" + area); 
        

       /* int[] numbers = {23,32,34,98,3,65,78};
		for(int i = 0; i<numbers.length;i++) {
			for(int n = 0; n<i;n--) {
				if(numbers[n] > numbers[n-1]) {
					int box=numbers[n-1];
					numbers[n-1]=numbers[n];
					numbers[n]=box;
				}
			}
		}
		for(int i = 0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
        */

        
		}
    }
}
