package com.consumer.dubbo;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import org.springframework.stereotype.Component;

@Component
@Activate(group = {Constants.PROVIDER, Constants.CONSUMER}, before = "DBFilter")
public class DubboBrandIdFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
//        HttpServletRequest httpRequest = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        String brandId = (String) httpRequest.getSession().getAttribute(SessionKey.CURRENT_BRAND_ID);
//        if(brandId == null){
//            brandId = DataSourceTarget.getDataSourceName();
//        }
        RpcContext.getContext().setAttachment("brandId", "拦截测试id");
        Result result = invoker.invoke(invocation);
        return result;
    }

}
