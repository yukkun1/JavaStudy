
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> array = new ArrayList<>();
		array.add("hoge");
		array.add("pos");
		array.add("foo");
		//      問① 下記例の配列をString型しか格納できないように修正してください。
		//		現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
		//	       例List<Object> array = new ArrayList<>();
		//		また、arrayには[hoge, pos, foo]の文字列３要素を入れてください。
		//	    <以下記述>
		//      問② arrayの二つ目の要素を"bar"にしましょう。
		//	　<以下記述>
		array.set(1, "bar");
		//      問③ fooが格納されているインデックスを出力してください。
		//	　<以下記述>

		System.out.println("fooのインデックス:" + array.indexOf("foo"));

		//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
		Map<String, Object> map = new HashMap<>();
		//	　<以下記述>
		map.put("key", "aderess");
		map.put("key1", "name");
		map.put("key2", "age");

		//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
		//	    <以下記述>
		for (String key : map.keySet()) {
			System.out.println("keys:" + key);
		}
		//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
		//	    <以下記述>
		for (Object values : map.values()) {
			System.out.println("values:" + values);

		}

		//      問⑦ Calender型calを使い、int型配列arrayDateに今の年・月・日を入れてください。
		Calendar cal = Calendar.getInstance();
		//	    <以下記述>
		//      問⑧ 配列arrayDateをList型に置換しましょう。
		//      ヒント：asListメソッドはプリミティブ型のデータ型のみ扱えます。
		//	    <以下記述>
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int[] arrayDate = { year, month, day };
		List<int[]> list1 = Arrays.asList(arrayDate); //asListの引数に入れることでリスト型に変更

		//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
		//	    <以下記述>
		//拡張文for文
		for (int[] num : list1) {
			for (int num1 : num) {
				System.out.println(num1);
			}
		}
	}
}