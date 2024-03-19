package kr.co.sist.dao;

import java.util.List;

import kr.co.sist.vo.EmpInfoVO;

public class UpdateEmployeeInformationDAO {
	private static UpdateEmployeeInformationDAO upEmpDAO;
	private UpdateEmployeeInformationDAO() {
		
	}//UpdateEmployeeInformationDAO
	
	public UpdateEmployeeInformationDAO getInstance(UpdateEmployeeInformationDAO upEmpDAO) {
		if(upEmpDAO==null) {
			upEmpDAO = new UpdateEmployeeInformationDAO();
		}//end if

		return upEmpDAO;
	}//getInstance


	
	/**
	 * 텍스트필드로 입력받은 사원의 정보로 DB내의 
	 * 사원의 정보를 변경하는 매서드.
	 * @param eVO
	 * @return
	 * 작성자: 김일신
	 */
	public int updateEmpInfo(EmpInfoVO eVO) {
		return 0;
		
	}//updateEmpInfo
	
	/**
	 * 선택된 사원의 사원번호로 
	 * 해당 사원의 논리삭제 상태를 변경하는 매서드
	 * @param empno
	 * @return
	 * 작성자: 김일신
	 */
	public int hideEmpInfo(int empno) {
		return empno;
		
	}
	/**
	 * 사원정보 변경 창에서 선택한 사원의 정보를
	 * JList에 출력하는 매서드
	 * @param empno
	 * @return
	 * 작성자: 김일신
	 */
	public List<EmpInfoVO> showSelectedEmpInfo(int empno){
		return null;
		
	}
}