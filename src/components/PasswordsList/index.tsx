import React from 'react';
import { FlatList, Text, View } from 'react-native';
import { PasswordContainer } from '../PasswordContainer';
import { styles } from './styles';

export function PasswordList() {

  const DATA = [
    {
      id: 'bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
      name: 'Facebook',
      icon: 'facebook-square'
    },
    {
      id: '3ac68afc-c605-48d3-a4f8-fbd91aa97f63',
      name: 'Instagram',
      icon: 'instagram'
    },
    {
      id: '3ac68afc-c605-48d3-a4f8-fbd91aa97f3',
      name: 'Twitch',
      icon: 'twitch'
    },
    {
      id: '3ac68afc-c605-48d3-a4f8-fbd91a97f63',
      name: 'Discord',
      icon: 'discord'
    },
    {
      id: '3ac68afc-c605-48d3-a4f8fbd91aa97f63',
      name: 'Amazon',
      icon: 'amazon'
    },
    {
      id: '58694a0f-3da1-471f-bd96-15571e9d72',
      name: 'Github',
      icon: 'github'
    },
    {
      id: '58694a0f-3da1-471f-bd96-1571e29d72',
      name: 'Steam',
      icon: 'steam'
    },
    {
      id: '58694a0f-3a1-471f-bd96-15571e29d72',
      name: 'Apple',
      icon: 'apple'
    },
    {
      id: '58694a0f-3da1-471f--bd96-15571e29d72',
      name: 'Dockerhub',
      icon: 'docker'
    },
  ];

  return (
    <View style={styles.container}>
      <FlatList 
        data={DATA}
        renderItem={({ item }) =>
          <PasswordContainer 
            data={item}
          />
        }
        keyExtractor={item => item.id}
      />
    </View>
  )
}
