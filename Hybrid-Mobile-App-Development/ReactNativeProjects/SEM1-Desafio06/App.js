import React from 'react';
import { Button, Image, StatusBar, View, StyleSheet } from 'react-native';

import image01 from './assets/1.png';
import image02 from './assets/2.png';
import image03 from './assets/3.png';
import image04 from './assets/4.png';


export default class App extends React.Component {

  constructor(props){
    super(props);

    this.state = {
      image: image01
    }

  }

  render() {
   return (
    <View style={styles.container}>

      <Image
        source={this.state.image}
        style= {styles.image} >
      </Image>

      <View style={styles.separator} />
      <Button
        title="Python"
        onPress={() => this.setState({"image":image01})}
        color="black"
      />
      <View style={styles.separator}  />
      <Button
        title="NodeJS"
        onPress={() => this.setState({"image":image02})}
        color="black"
      />
      <View style={styles.separator} />
      <Button
        title="Golang"
        onPress={() => this.setState({"image":image03})}
        color="black"
      />
      <View style={styles.separator} />
      <Button
        title="Ruby"
        onPress={() => this.setState({"image":image04})}
        color="black"
      />
      <StatusBar />

    </View>
    )
  }
}

const styles = StyleSheet.create({
  container: {
    backgroundColor: 'gray',
    flex: 1,
    padding: 20
  },
  image: {
    alignSelf: 'center',
    height: 200,
    width: 200

  },
  separator: {
    marginBottom: 15,
  }
})
