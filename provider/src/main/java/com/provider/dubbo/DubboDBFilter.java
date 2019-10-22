package com.provider.dubbo;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import org.springframework.stereotype.Component;

@Component
@Activate(group = {Constants.PROVIDER, Constants.CONSUMER}, before = "DBFilter")
public class DubboDBFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String brandId = RpcContext.getContext().getAttachment("brandId");
//        if(brandId==null){
//            brandId = DataSourceContextHolder.getDataSourceName();
//        }
//        if(StringUtils.isNotBlank(brandId)){
//            DataSourceContextHolder.setDataSourceName(brandId);
//            DataSourceContextHolderReport.setDataSourceName(brandId);
//            RpcContext.getContext().setAttachment("brandId", brandId);
//        }
        System.out.println(brandId);
        Result result = invoker.invoke(invocation);
        return result;
    }
}
