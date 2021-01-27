import React, {Component} from "react";
import axios from "axios";

class MainComponent extends Component {    
    constructor(props) {
        super(props)
        this.state = {
            message: "",
            id: ""
        }
    }

    componentDidMount() {
        this.getApi();
        this.getId();
    }

    getApi = () => {
        axios.get("http://localhost:8080/api/hello")
            .then(res => {
                console.log(res);
                this.setState({
                    message: res.data.message
                })
            })
            .catch(res => console.log(res))
    }

    getId = () => {
        axios.get("http://localhost:8080/user/1")
            .then(res => {
                console.log(res);
                this.setState({
                    id: res.data.message
                })
            })
            .catch(res => console.log(res))
    }

    render() {
        return(
            <div>
                Main 페이지?
                <br/>
                {this.state.message}
                {this.state.id}
            </div>
        )
    }
}

export default MainComponent