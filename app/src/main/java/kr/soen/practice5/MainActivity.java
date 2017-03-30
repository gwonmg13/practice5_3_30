package kr.soen.practice5;

import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.view.Gravity;
public class MainActivity extends AppCompatActivity {

    Button button2,button3,button4,button5;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void onclick(View v){

       if(v.getId()==R.id.button2){

           Toast.makeText(getApplicationContext(),"일반 메세지 창입니다.",Toast.LENGTH_SHORT).show();

       }else if(v.getId()==R.id.button3){
            Toast toastView = Toast.makeText(getApplicationContext(),"중간에 뜨게하기 ",Toast.LENGTH_SHORT);

       }else if(v.getId()==R.id.button4){

           View view = getLayoutInflater().inflate(R.layout.mytoast,null);
           tv1 = (TextView)view.findViewById(R.id.textView3);
           //inflate에서 가져온 뷰에서 아이디를 찾아와야한다.
           tv1.setText("레이아웃으로 만든 톡스트 창입니다.");

           Toast toastView2 = new Toast(this);

           toastView2.setDuration(Toast.LENGTH_SHORT);
           toastView2.setGravity(Gravity.CENTER, 0,100);
           toastView2.setView(view);
           toastView2.show();


       }else if(v.getId()==R.id.button5){
           Snackbar.make(v,"Message",3000).setAction("확인~", new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   //
               }
           }).show();
       }else if(v.getId() == R.id.button6){
           AlertDialog.Builder dlg = new AlertDialog.Builder(this);

           dlg.setTitle("제목").setMessage("내용")
                   .setIcon(R.mipmap.ic_launcher_round)
                   .setPositiveButton("닫기",null)
                   .setNegativeButton("확인",null)
                   .show();

      }else if(v.getId()==R.id.button7){
           AlertDialog.Builder dlg = new AlertDialog.Builder(this);
           String data[] = {"치킨","피자"};

           dlg.setTitle("먹고싶은 메뉴는?")
                   .setSingleChoiceItems(data, 1, null)//배열, 누구를 먼저 선택되게 하고 싶은지 , 선택했을떄 뭔짓하고싶은지지
                   .setPositiveButton("닫기",null)
                   .setNegativeButton("확인",new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {

                       }
                   })
                   .show();

       }else if(v.getId()==R.id.button8){
           AlertDialog.Builder dlg = new AlertDialog.Builder(this);
           final String data[] = {"치킨","피자","짜장","탕슉"};
           final boolean checked[]={true,false,true,false};

           dlg.setTitle("먹고싶은 메뉴는?")
                   .setMultiChoiceItems(data, checked, new DialogInterface.OnMultiChoiceClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                           checked[which] = isChecked;
                       }
                   })
                   .setPositiveButton("닫기",null)
                   .setNegativeButton("확인",new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {

                           String print="";
                           for(int i=0; i<checked.length; i++){
                               print = data[i] +",";
                           }
                           Toast.makeText(getApplicationContext(),
                                   print+"가 선택되었습니다.",Toast.LENGTH_SHORT).show();

                       }
                   })
                   .show();


       }else if(v.getId()==R.id.button9){
           View view3 = getLayoutInflater().inflate(R.layout.practice,null);
           final EditText et = (EditText)view3.findViewById(R.id.editText);

           AlertDialog.Builder dlg = new AlertDialog.Builder(this);
           final String data[] = {"치킨","피자","짜장","탕슉"};
           dlg.setTitle("먹고싶은 메뉴는?")
                   .setView(view3)

                   .setPositiveButton("닫기",null)
                   .setNegativeButton("확인",null)
                   .show();


       }

   }
}
