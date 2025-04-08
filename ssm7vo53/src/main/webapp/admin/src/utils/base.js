const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm7vo53/",
            name: "ssm7vo53",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm7vo53/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "连锁干洗店后台管理系统"
        } 
    }
}
export default base
