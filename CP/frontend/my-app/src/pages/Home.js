import {Component} from "react";
import axios from "axios";
import {Row} from "react-bootstrap";
import Games from "../components/Games";
import {withRouter} from "react-router-dom";

class Home extends  Component
{

    constructor(props) {
        super(props);
        this.movieId = props.movieId;
        this.isSelected = props.isSelected;
        this.state = {
            games: []
        }
    }


    componentDidMount() {

        const getGames = async () => {

            const GAME_LIBRARY_URL = `https://api.rawg.io/api/games?key=${process.env["REACT_APP_API_KEY"]}`
            await axios.get(GAME_LIBRARY_URL)
                .then(response => {
                    console.log(response.data.results)
                    this.setState({games: response.data.results});

                }).catch((err) => {
                    console.log("Fetch Error: " + err)
                });

        }


        getGames()

    }


    render() {
        return(
            <Row>
                {
                    this.state.games.map((game,i) => <Games games={game} isSelected={false} key={i}  /> )
                }
            </Row>

        );


    }

}

export default withRouter(Home);