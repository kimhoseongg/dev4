package first.sample.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;

@Repository("sampleDAO")  //@Repository DAO����� �ַ� ���
public class SampleDAO extends AbstractDAO  //�� ��� extends�� ��� �޾����� �״�� �����
{
	
	@SuppressWarnings("unchecked") //���� ��� �ʿ����
	public Map<String, Object> selectBoardList(Map<String, Object> map) throws Exception
	{
		//return (List<Map<String, Object>>) selectList("sample.selectBoardList", map);
		//ù��° ���ڰ��� ���� �̸� -> sample.selectBoardList
		return (Map<String, Object>) selectPagingList("sample.selectBoardList", map);
	}
	
	@SuppressWarnings("unchecked") //���� ��� �ʿ����
	public Map<String, Object> openLogin(Map<String, Object> map) throws Exception
	{	
		return (Map<String, Object>) selectOne("sample.openLogin", map);
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBoardListSearch(Map<String, Object> map) throws Exception
	{
		return (Map<String, Object>) selectPagingList("sample.selectBoardListSearch", map);
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBoardListTitle(Map<String, Object> map) throws Exception
	{
		return (Map<String, Object>) selectPagingList("sample.selectBoardListTitle", map);
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBoardListAll(Map<String, Object> map) throws Exception
	{
		return (Map<String, Object>) selectPagingList("sample.selectBoardListAll", map);
	}


	public void insertBoard(Map<String, Object> map) throws Exception
	{
		insert("sample.insertBoard", map);
	}
	
	public void insertFile(Map<String, Object> map) throws Exception
	{
		insert("sample.insertFile", map);
	}
	
	/*public void updateHitCnt(Map<String, Object> map) throws Exception
	{
		update("sample.updateHitCnt", map);
	}*/
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception{
		return (Map<String, Object>) selectOne("sample.selectBoardDetail", map);
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBoardDetailNext(Map<String, Object> map) throws Exception{
		return (Map<String, Object>) selectOne("sample.selectBoardDetailNext", map);
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBoardDetailPrev(Map<String, Object> map) throws Exception{
		return (Map<String, Object>) selectOne("sample.selectBoardDetailPrev", map);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectFileList(Map<String, Object> map) throws Exception
	{
		return (List<Map<String, Object>>) selectList("sample.selectFileList", map);
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> boardUpdate(Map<String, Object> map) throws Exception
	{
		return (Map<String, Object>) selectOne("sample.boardUpdate", map);
	}
	
	public void updateBoard(Map<String, Object> map) throws Exception
	{
		update("sample.updateBoard", map);
	}

	public void deleteBoard(Map<String, Object> map) throws Exception 
	{
		delete("sample.deleteBoard", map);
	}

	public void updateHitCnt(Map<String, Object> map) 
	{
		update("sample.updateHitCnt", map);
	}

	public void deleteFileList(Map<String, Object> map) 
	{
		update("sample.deleteFileList", map);
	}

	public void updateFile(Map<String, Object> map) 
	{
		update("sample.updateFile", map);
	}

	public int minIDX() {
		// TODO Auto-generated method stub
		return (Integer) selectOne("sample.minIDX");
	}

	public int maxIDX() {
		// TODO Auto-generated method stub
		return (Integer) selectOne("sample.maxIDX");
	}

	
	
}
