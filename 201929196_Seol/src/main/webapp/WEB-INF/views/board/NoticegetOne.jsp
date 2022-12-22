<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
    
<%@include file="../includes/header.jsp" %>
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">게시글 확인</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            현재 등록된 게시글
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">

                           <div class="form-group">
                               <label>제목</label>
                               <input class="form-control" name="title" readonly value="<c:out value='${board.title}'/>">
                           </div>	
                           <div class="form-group">
                                <label>내용</label>
                                <textarea class="form-control" rows="3" name="content" readonly><c:out value='${board.content}'/></textarea>
                           </div>
                           <div class="form-group">
                               <label>작성자</label>
                               <input class="form-control" name="writer" readonly value="<c:out value='${board.writer}'/>">
                           </div>
                           <button type="submit" class="btn btn-default"><a href="/board/notice">목록</a></button>
                           <button type="reset" class="btn btn-default"><a href="/board/Noticemodify?bno=<c:out value='${board.bno}'/>">관리</a></button>
                        
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->


<%@include file="../includes/footer.jsp"%>