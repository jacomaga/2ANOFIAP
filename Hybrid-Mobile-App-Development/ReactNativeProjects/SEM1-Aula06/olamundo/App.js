import React from 'react';
import { StyleSheet, StatusBar, Text, View } from 'react-native';

export default class App extends React.Component{
  render() {
    return(
      <View style={styles.container}>
        <Text>Ola, novamente!</Text>
        <StatusBar style="auto" />
        <View>
          <View style={{ backgroundColor: 'crimson', height: 200, width: 200 }}></View>
          <View style={{ alignSelf: 'center', backgroundColor: 'cornflowerblue',
                         borderRadius: 100, height: 200, width: 200,
                         marginVertical: 20, alignItems: 'center', justifyContent: 'center' }}>
            <Text>Texto!</Text>
          </View>
        </View>
      </View>
    );
  }
}

const styles = StyleSheet.create ({
  container: {
    flex: 1,
    alignItems: 'center',
    alignContent: 'center',
    justifyContent: 'center',
    textAlign: 'center',
  }
});