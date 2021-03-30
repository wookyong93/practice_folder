package Ex09.Service;
import Ex09.Member;
import Ex09.DAO.DatabaseService;
import Ex09.DAO.DatabaseServiceImpl;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginServiceImpl implements LoginService{

   @Override
   public void LoginProc(String id) {
      // TODO Auto-generated method stub
      Stage myInfo = new Stage();
      FXMLLoader loader = 
            new FXMLLoader(getClass().getResource("../Success.fxml"));
      
      Parent myInfoForm = null;
      try {
         myInfoForm = loader.load();
      } catch(Exception e) {
         e.printStackTrace();
      }
         
      Member member = search(id);
      System.out.println(member.getName());
      TextField mName = (TextField) myInfoForm.lookup("#txtName");
      mName.setText(member.getName());
      TextField mId = (TextField) myInfoForm.lookup("#txtId");
      mId.setText(member.getId());
      TextField mPw = (TextField) myInfoForm.lookup("#txtPw");
      mPw.setText(member.getPw());
      
      RadioButton mGender = null;
      if (member.isGender() == 0) {
         mGender = (RadioButton) myInfoForm.lookup("#rdoMan");
         mGender.setSelected(true);
      } else {
         mGender = (RadioButton) myInfoForm.lookup("#rdoWoman");
         mGender.setSelected(true);
      }
      
      CheckBox chk = null;
      int hobby = member.getHobby();
      if(hobby >= 4) {
         chk = (CheckBox)myInfoForm.lookup("#chkMovie");
         chk.setSelected(true);
         hobby -= 4;
      }
      if (hobby >= 2) {
         chk = (CheckBox)myInfoForm.lookup("#chkSport");
         chk.setSelected(true);
         hobby -=2; 
      }
      if(hobby == 1) {
         chk = (CheckBox)myInfoForm.lookup("#chkMusic");
         chk.setSelected(true);
      }
      
      String[] items = {"20대 미만", "20대","30대","40대","50대","60대 이상"};
      
      ComboBox<String> cmbAge = (ComboBox<String>)myInfoForm.lookup("#cmbAge");
      
      if(cmbAge != null) {
         for(String item : items) {
            cmbAge.getItems().add(item);
         }
      }
      cmbAge.setValue(member.getAge());
      
      myInfo.setScene(new Scene(myInfoForm));
      myInfo.setTitle("나의 정보");
      myInfo.show();
   }

   @Override
   public Member search(String id) {
      // TODO Auto-generated method stub
      DatabaseService dataSrv  = null;
      try {
         dataSrv = new DatabaseServiceImpl();
      } catch(Exception e) {
         e.printStackTrace();
      }   
      
      Member member = dataSrv.search(id);
      return member;
   }
}
