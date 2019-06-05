package burp;

public class HttpRequestResponse implements IHttpRequestResponse
{

    private byte[] request;
    private byte[] response;
    private String comment;
    private String highlight;
    private HttpService httpService;

    public HttpRequestResponse(){
    }

    public HttpRequestResponse(IHttpRequestResponse copy){
        this.request = copy.getRequest();
        this.response = copy.getResponse();
        this.comment = copy.getComment();
        this.highlight = copy.getHighlight();
        this.httpService = new HttpService(copy.getHttpService());
    }

    @Override
    public byte[] getRequest() {
        return request;
    }

    @Override
    public void setRequest(byte[] message) {
        request = message;
    }

    @Override
    public byte[] getResponse() {
        return response;
    }

    @Override
    public void setResponse(byte[] message) {
        response = message;
    }

    @Override
    public String getComment() {
        return comment;
    }

    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String getHighlight() {
        return highlight;
    }

    @Override
    public void setHighlight(String color) {
        this.highlight = highlight;
    }

    @Override
    public IHttpService getHttpService() {
        return httpService;
    }

    @Override
    public void setHttpService(IHttpService httpService) {
        this.httpService = new HttpService(httpService);
    }
}
