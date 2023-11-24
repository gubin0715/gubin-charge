## 系统模块
~~~
com.gubin   
├── gubin-common            // 通用模块
│       └── gubin-common-core                         // 核心模块
│       └── gubin-common-datasource                   // 多数剧源
│       └── gubin-common-log                          // 日志记录
│       └── gubin-common-mq                           // 消息模块
│       └── gubin-common-redis                        // 缓存服务
│       └── gubin-common-seata                        // 分布式事务
├── gubin-gateway           // 网关
├── gubin-modules           // 业务模块
│       └── gubin-commodity                           // 商品服务
│       └── gubin-generator                           // 代码生成
│       └── gubin-order                               // 订单服务
│       └── gubin-system                              // 后台管理
│       └── gubin-user                                // 用户服务
├──pom.xml                  // 公共依赖

