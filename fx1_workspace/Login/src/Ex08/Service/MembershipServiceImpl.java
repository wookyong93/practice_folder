package Ex08.Service;

public class MembershipServiceImpl  implements MembershipService{
		@Override
	public boolean comparePw(String pw, String pwOk) {
		// TODO Auto-generated method stub
		if(pw.contentEquals(pwOk)) {
			return true;
		}
		return false;
	}
}
