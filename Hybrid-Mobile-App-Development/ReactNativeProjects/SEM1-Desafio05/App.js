import React from "react";
import {
    Alert, Button, StatusBar, StyleSheet, TextInput, View, Text,
} from "react-native";

export default class App extends React.Component {
    constructor(props) {
        super(props);

        this.state = {
            weight: "",
            height: "",
            imc: "",

        };


    }

    getIMC = () => {
        const { weight, height } = this.state;
        const floatWeight = parseFloat(weight);
        const floatHeight = parseFloat(height);

        if(Number.isNaN(floatHeight) || Number.isNaN(floatWeight)) return Alert.alert("Error", "Invalid Input");


        const imc = floatWeight / (floatHeight * floatHeight);

        let category = "";

        if ( imc < 18.5 ){
            category = "Under Weight";
        } else if (imc < 25){
            category = "Normal Weight";
        } else if (imc < 30 ){
            category = "Over Weight";
        } else {
            category = "Obesse";
        }

        const message = `IMC = ${imc.toFixed(1)} \n ${category}`;

        Alert.alert("IMC", message);
    };

    render() {
        const { imc } = this.state;

        return (
            <View style={styles.container}>
                <StatusBar style="auto" />
                <Text style={{ fontSize: 30, fontFamily: "Roboto", marginBottom: 10 }}>IMC</Text>

                <TextInput style={styles.input}
                    placeholder="Insira sua altura"
                    keyboardType="numeric"
                    onChangeText={val => this.setState({ height: val })} />

                <TextInput style={styles.input}
                    placeholder="Insira seu peso"
                    keyboardType="numeric"
                    onChangeText={val => this.setState({ weight: val })} />

                <Button title="Calcular" color="black" onPress={this.getIMC}/>

            </View>
        );
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        alignItems: "center",
        justifyContent: "center",
    },
    input: {
        alignSelf: "center",
        color: "black",
        borderColor: "black",
        borderBottomColor: "black",
        borderBottomWidth: 1,
        width: 300,
        textAlign: "center",
        marginBottom: 20
    },
});
