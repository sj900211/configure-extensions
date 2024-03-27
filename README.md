# Configure > Extensions
> 다른 설정에 영향이 없는 공통 기능 또는 모델을 정의
> - ## [IdLongData](./src/main/java/run/freshr/common/dto/data/IdLongData.java)
>> 일련 번호(`Long`, `id`) 모델
> - ## [IdStringData](./src/main/java/run/freshr/common/dto/data/IdStringData.java)
>> 일련 번호(`String`, `id`) 모델
> - ## [IdOrderRequest](./src/main/java/run/freshr/common/dto/request/IdOrderRequest.java)
>> 일련 번호(`?`, `id`) 와 정렬 순서(`Integer` `sort`) 요청 모델  
>> 정렬 순서의 이름을 `order` 로 정의하는 것이 의미가 가장 알맞으나 다음과 같은 이유로 `sort` 로 정의  
>> - 요청, 반환 필드 이름은 QueryParameter 나 Entity 에 없는 항목 등의 특수한 상황을 제외하면 Entity 필드 이름과 똑같이 짓는다.  
>>   이건은 로직에서 모델을 Entity 로 변환하거나, Entity 를 모델로 변환할 때 ModelMapper 기능을 사용하여 간편하게 변환하는 것이 목적.
>> - 위 사항을 지킨다고 했을 때 column 이름을 order 로 정의하면 예약어와 충돌이 발생해 오류가 발생할 수 있다.  
>>   물론 @Column 을 사용해서 column 과 필드 이름을 다르게 사용할 수 있지만 작업자에게 혼란을 줄 수 있기 때문에 통일하는 것을 우선한다.
> - ## [IdRequest](./src/main/java/run/freshr/common/dto/request/IdRequest.java)
>> 일련 번호(`?`, `id`) 요청 모델
> - ## [IdResponse](./src/main/java/run/freshr/common/dto/response/IdResponse.java)
>> 일련 번호(`?`, `id`) 반환 모델
> - ## [IsResponse](./src/main/java/run/freshr/common/dto/response/IsResponse.java)
>> 진리값(`Boolean`, `is`) 반환 모델
> - ## [KeyResponse](./src/main/java/run/freshr/common/dto/response/KeyResponse.java)
>> 키(`?`, `key`) 반환 모델
> - ## [SearchExtension](./src/main/java/run/freshr/common/extensions/request/SearchExtension.java)
>> QueryParameter 에서 많이 사용하는 필드를 정의한 공통 VO  
>> `library-docs-search-docs` 를 상속받아 구현
> - ## [UnitDefaultExtension](./src/main/java/run/freshr/common/extensions/unit/UnitDefaultExtension.java)
>> Unit 의 공통 기능 정의  
>> Unit 의 대한 자세한 내용은 `library-core-unit` 를 참고