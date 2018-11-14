# .gitignore 이란?
.gitignore 파일이란 Git 버전 관리에서 제외할 파일 목록을 지정하는 파일 이다.   
git으로 프로젝트를 관리할 때, 그 프로젝트 안의 특정파일들은 관리할 필요가 없는 경우가 있다.   
예를 들면, 프로젝트 설정파일, 자동으로 생성되는 로그파일(ex.*.log), 빌드할 때 생기는 컴파일된 파일(ex. *.class) 등이 있다.   
따라서 이런 관리할 필요가 없는 파일들을 git이 track 하지 않도록 .gitignore을 설정하는 것이다.  
  
### .gitignore 생성하기 
git에 first commit 하기 전에 .gitignore을 먼저 commit 해준다.
```  
// .gitignore 파일을 생성한다.
$ touch .gitignore
// .gitignore은 숨김 파일이므로 아래의 2가지 방법으로 제대로 생성됐는지를 확인한다.
$ la
$ ls -a
// .gitignore 파일을 수정한다.
$ vi .gitignore  
// 입력한후 :wq 입력하여 저장하고 종료한다.
```  
