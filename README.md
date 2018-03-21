# seckill-java-web-
  相关技术1. Spring&amp;SpringMVC 2. MyBatis 2. MySQL 3. Restful 4. Bootstrap&amp;jQuery 5.maven 6.Junit
1.Maven命令行：mvn archetype:generate -DgroupId=org.seckill -DartifactId=seckill -DarchetypeArtifactId=maven-archetype-webapp -DarchetypeCatalog=local
2.数据库设计：秒杀库存表和秒杀成功明细表
  一个seckill对应多个秒杀成功明细
3.实体和DAO层的开发
  秒杀明细成功需要过滤重复：根据id查询SuccessKilled并携带秒杀产品对象实体
4.用mybatis实现具体dao接口
  Mapper自动实现dao接口
5.spring mybatis整合
6.Junit测试
7.Service层
8.集成测试service业务逻辑
9.设计resful接口
10.Springmvc
11.Bootstrap开发页面结构
12.测试
13.优化：减少行级锁的持有时间，update一行数据后快速commit
   把客户端逻辑放到mysql服务器上，避免网络延迟和gc影响（使用存储过程，整个事务在mysql端完成）
   前端： 暴露接口按钮防重复
