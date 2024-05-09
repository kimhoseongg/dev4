package first.sample.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface SampleService {

	Map<String, Object> selectBoardList(Map<String, Object> map) throws Exception;
	
	
	Map<String, Object> selectBoardListSearch(Map<String, Object> map) throws Exception;
	
	Map<String, Object> selectBoardListTitle(Map<String, Object> map) throws Exception;
	
	Map<String, Object> selectBoardListAll(Map<String, Object> map) throws Exception;
	

	void insertBoard(Map<String, Object> map, HttpServletRequest request) throws Exception;
	
	Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception;
	
	Map<String, Object> selectBoardDetailNext(Map<String, Object> map) throws Exception;
	
	Map<String, Object> selectBoardDetailPrev(Map<String, Object> map) throws Exception;
	
	Map<String, Object> boardUpdate(Map<String, Object> map) throws Exception;

	void updateBoard(Map<String, Object> map, HttpServletRequest request) throws Exception;

	void deleteBoard(Map<String, Object> map) throws Exception;


	int minIDX();

	int maxIDX();


	Map<String, Object> openLogin(Map<String, Object> map)throws Exception;


	

	

}
