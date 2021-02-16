package club.mrxiao.common.error;

/**
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-16
 */
public class ExpressErrorException extends Exception {

    private static final long serialVersionUID = 3264755162484009028L;


    private ExpressError error;


    public ExpressErrorException(ExpressError error){
        super(error.toString());
        this.error = error;
    }


    public ExpressErrorException(ExpressError error, Throwable cause) {
        super(error.toString(), cause);
        this.error = error;
    }

    public ExpressError getError() {
        return this.error;
    }
}
