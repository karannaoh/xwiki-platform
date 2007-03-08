package com.xpn.xwiki.gwt.api.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ldubost
 * Date: 19 nov. 2006
 * Time: 19:40:30
 * To change this template use File | Settings | File Templates.
 */
public interface XWikiServiceAsync {

    void getDocument(String fullName, AsyncCallback async);

    void getDocument(String fullName, boolean full, AsyncCallback async);

    void getDocument(String fullName, boolean full, boolean viewDisplayers, boolean editDisplayers, AsyncCallback async);

    void getUser(String fullName, AsyncCallback async);

    void getUserList(int nb, int start, AsyncCallback async);

    void searchDocuments(String sql, int nb, int start, AsyncCallback async);

    void getDocuments(String sql, int nb, int start, AsyncCallback async);

    void getDocuments(String sql, int nb, int start, boolean fullName, AsyncCallback async);

    void getDocuments(String sql, int nb, int start, boolean fullName, boolean viewDisplayers, boolean editDisplayers, AsyncCallback async);

    void updateProperty(String doc, String className, String propertyname, String value, AsyncCallback async);

    void updateProperty(String doc, String className, String propertyname, int value, AsyncCallback async);

    void updateProperty(String docname, String className, String propertyname, List value, AsyncCallback async);

    void addComment(String docname, String message, AsyncCallback async);

    void addObject(String docname, XObject xobject, AsyncCallback async);

    void customQuery(String queryPage, AsyncCallback async);

    void customQuery(String queryPage, int nb, int start, AsyncCallback async);

    void getDocumentContent(String fullName, AsyncCallback async);

    void getDocumentContent(String fullName, boolean rendered, AsyncCallback async);

    void getDocumentContent(String fullName, boolean rendered, Map params, AsyncCallback async);
}
